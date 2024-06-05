package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.258f, 21.328f)
                curveToRelative(-0.787f, -1.075f, -1.258f, -2.396f, -1.258f, -3.828f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(1.432f, 0.0f, 2.752f, 0.471f, 3.828f, 1.258f)
                lineToRelative(-9.069f, 9.07f)
                close()
                moveTo(13.672f, 22.742f)
                curveToRelative(1.075f, 0.787f, 2.396f, 1.258f, 3.827f, 1.258f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                curveToRelative(0.0f, -1.432f, -0.471f, -2.752f, -1.258f, -3.828f)
                lineToRelative(-9.069f, 9.069f)
                close()
                moveTo(11.999f, 11.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.308f, -2.692f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(0.0f, 2.692f, 0.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(8.999f, 17.5f)
                curveToRelative(0.0f, -1.655f, 0.48f, -3.194f, 1.298f, -4.5f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.308f, 2.692f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.719f, 0.0f, 3.268f, -0.731f, 4.363f, -1.894f)
                curveToRelative(-0.859f, -1.328f, -1.363f, -2.907f, -1.363f, -4.606f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
