package me.localx.icons.straight.outline

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

public val Icons.Outline.Banner: ImageVector
    get() {
        if (_banner != null) {
            return _banner!!
        }
        _banner = Builder(name = "Banner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.918f, 7.142f)
                lineToRelative(-1.878f, -0.271f)
                curveToRelative(-2.757f, -0.397f, -6.735f, -0.871f, -10.04f, -0.871f)
                reflectiveCurveToRelative(-7.283f, 0.474f, -10.04f, 0.871f)
                lineToRelative(-1.878f, 0.271f)
                lineToRelative(4.582f, 4.981f)
                lineTo(0.301f, 18.055f)
                lineToRelative(2.342f, -0.32f)
                curveToRelative(2.005f, -0.274f, 5.888f, -0.734f, 9.357f, -0.734f)
                reflectiveCurveToRelative(7.353f, 0.46f, 9.357f, 0.734f)
                lineToRelative(2.342f, 0.32f)
                lineToRelative(-4.363f, -5.932f)
                lineToRelative(4.582f, -4.981f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-2.508f, 0.0f, -5.21f, 0.23f, -7.312f, 0.465f)
                lineToRelative(2.563f, -3.484f)
                lineToRelative(-3.116f, -3.387f)
                curveToRelative(2.443f, -0.31f, 5.366f, -0.594f, 7.864f, -0.594f)
                reflectiveCurveToRelative(5.421f, 0.284f, 7.864f, 0.594f)
                lineToRelative(-3.116f, 3.387f)
                lineToRelative(2.563f, 3.484f)
                curveToRelative(-2.102f, -0.235f, -4.804f, -0.465f, -7.312f, -0.465f)
                close()
            }
        }
        .build()
        return _banner!!
    }

private var _banner: ImageVector? = null
