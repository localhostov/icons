package me.localx.icons.rounded.bold

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

public val Icons.Bold.CediSign: ImageVector
    get() {
        if (_cediSign != null) {
            return _cediSign!!
        }
        _cediSign = Builder(name = "CediSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.14f, 15.4f)
                curveToRelative(-0.74f, -0.38f, -1.64f, -0.09f, -2.02f, 0.64f)
                curveToRelative(-0.8f, 1.55f, -2.37f, 2.63f, -4.12f, 2.89f)
                lineTo(14.0f, 5.06f)
                curveToRelative(1.78f, 0.26f, 3.36f, 1.37f, 4.16f, 2.97f)
                curveToRelative(0.37f, 0.74f, 1.27f, 1.05f, 2.01f, 0.67f)
                curveToRelative(0.74f, -0.37f, 1.04f, -1.27f, 0.68f, -2.01f)
                curveToRelative(-1.3f, -2.61f, -3.92f, -4.37f, -6.84f, -4.65f)
                verticalLineToRelative(-0.54f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.51f)
                curveToRelative(-4.45f, 0.24f, -8.0f, 3.93f, -8.0f, 8.44f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.0f, 4.51f, 3.55f, 8.2f, 8.0f, 8.44f)
                verticalLineToRelative(0.51f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.54f)
                curveToRelative(2.87f, -0.28f, 5.47f, -2.0f, 6.78f, -4.54f)
                curveToRelative(0.38f, -0.74f, 0.09f, -1.64f, -0.64f, -2.02f)
                close()
                moveTo(6.0f, 13.54f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0.0f, -2.85f, 2.2f, -5.2f, 5.0f, -5.43f)
                verticalLineToRelative(13.96f)
                curveToRelative(-2.8f, -0.23f, -5.0f, -2.58f, -5.0f, -5.43f)
                close()
            }
        }
        .build()
        return _cediSign!!
    }

private var _cediSign: ImageVector? = null
