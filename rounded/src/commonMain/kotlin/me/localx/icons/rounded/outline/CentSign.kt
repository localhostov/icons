package me.localx.icons.rounded.outline

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

public val Icons.Outline.CentSign: ImageVector
    get() {
        if (_centSign != null) {
            return _centSign!!
        }
        _centSign = Builder(name = "CentSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.62f, 17.47f)
                curveToRelative(-1.44f, 2.79f, -4.29f, 4.53f, -7.43f, 4.53f)
                horizontalLineToRelative(-0.18f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.01f)
                curveToRelative(-4.44f, -0.19f, -8.0f, -3.87f, -8.0f, -8.35f)
                verticalLineToRelative(-3.27f)
                curveTo(3.0f, 5.87f, 6.56f, 2.2f, 11.0f, 2.01f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.18f)
                curveToRelative(3.2f, 0.0f, 6.07f, 1.78f, 7.49f, 4.65f)
                curveToRelative(0.25f, 0.5f, 0.04f, 1.09f, -0.45f, 1.34f)
                reflectiveCurveToRelative(-1.1f, 0.04f, -1.34f, -0.45f)
                curveToRelative(-1.08f, -2.18f, -3.27f, -3.54f, -5.7f, -3.54f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(-3.51f, 0.0f, -6.36f, 2.85f, -6.36f, 6.36f)
                verticalLineToRelative(3.27f)
                curveToRelative(0.0f, 3.51f, 2.85f, 6.36f, 6.36f, 6.36f)
                horizontalLineToRelative(1.82f)
                curveToRelative(2.39f, 0.0f, 4.56f, -1.32f, 5.66f, -3.45f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }
        .build()
        return _centSign!!
    }

private var _centSign: ImageVector? = null
