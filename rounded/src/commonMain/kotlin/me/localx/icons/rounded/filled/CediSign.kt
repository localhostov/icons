package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.CediSign: ImageVector
    get() {
        if (_cediSign != null) {
            return _cediSign!!
        }
        _cediSign = Builder(name = "CediSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.19f, 16.12f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-1.1f, 2.13f, -3.27f, 3.45f, -5.66f, 3.45f)
                horizontalLineToRelative(-0.18f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(0.18f)
                curveToRelative(2.43f, 0.0f, 4.62f, 1.35f, 5.7f, 3.54f)
                curveToRelative(0.25f, 0.49f, 0.85f, 0.7f, 1.34f, 0.45f)
                curveToRelative(0.49f, -0.25f, 0.7f, -0.85f, 0.45f, -1.34f)
                curveToRelative(-1.42f, -2.87f, -4.3f, -4.65f, -7.49f, -4.65f)
                horizontalLineToRelative(-0.18f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.02f)
                curveToRelative(-4.44f, 0.19f, -8.0f, 3.86f, -8.0f, 8.34f)
                verticalLineToRelative(3.27f)
                curveToRelative(0.0f, 4.49f, 3.56f, 8.15f, 8.0f, 8.34f)
                verticalLineToRelative(1.02f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.18f)
                curveToRelative(3.14f, 0.0f, 5.99f, -1.74f, 7.43f, -4.53f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
                moveTo(5.0f, 13.63f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0.0f, -3.39f, 2.66f, -6.15f, 6.0f, -6.34f)
                verticalLineToRelative(15.96f)
                curveToRelative(-3.34f, -0.19f, -6.0f, -2.96f, -6.0f, -6.34f)
                close()
            }
        }
        .build()
        return _cediSign!!
    }

private var _cediSign: ImageVector? = null
