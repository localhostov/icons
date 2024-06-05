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

public val Icons.Filled.LightbulbSlash: ImageVector
    get() {
        if (_lightbulbSlash != null) {
            return _lightbulbSlash!!
        }
        _lightbulbSlash = Builder(name = "LightbulbSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.57f, 16.15f)
                curveToRelative(0.12f, -0.13f, 0.23f, -0.28f, 0.36f, -0.39f)
                curveToRelative(1.95f, -1.71f, 3.07f, -4.17f, 3.07f, -6.76f)
                reflectiveCurveToRelative(-1.1f, -5.01f, -3.01f, -6.71f)
                curveTo(16.09f, 0.58f, 13.52f, -0.23f, 10.96f, 0.06f)
                curveToRelative(-2.38f, 0.27f, -4.57f, 1.53f, -6.05f, 3.43f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.45f)
                lineTo(22.54f, 23.95f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.38f, -6.38f)
                close()
                moveTo(7.87f, 19.0f)
                curveToRelative(-0.26f, -1.25f, -0.95f, -2.44f, -2.01f, -3.42f)
                curveToRelative(-2.15f, -2.0f, -3.17f, -4.83f, -2.79f, -7.76f)
                curveToRelative(0.02f, -0.15f, 0.05f, -0.29f, 0.08f, -0.43f)
                lineToRelative(11.61f, 11.61f)
                lineTo(7.87f, 19.0f)
                close()
                moveTo(16.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _lightbulbSlash!!
    }

private var _lightbulbSlash: ImageVector? = null
