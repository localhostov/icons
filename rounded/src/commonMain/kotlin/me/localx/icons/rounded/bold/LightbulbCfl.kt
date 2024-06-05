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

public val Icons.Bold.LightbulbCfl: ImageVector
    get() {
        if (_lightbulbCfl != null) {
            return _lightbulbCfl!!
        }
        _lightbulbCfl = Builder(name = "LightbulbCfl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.139f, 10.102f)
                curveToRelative(-0.348f, -0.752f, -0.02f, -1.643f, 0.732f, -1.991f)
                lineTo(17.871f, 2.105f)
                curveToRelative(0.748f, -0.347f, 1.643f, -0.021f, 1.99f, 0.733f)
                curveToRelative(0.348f, 0.752f, 0.02f, 1.643f, -0.732f, 1.991f)
                lineTo(6.129f, 10.834f)
                curveToRelative(-0.203f, 0.094f, -0.417f, 0.139f, -0.628f, 0.139f)
                curveToRelative(-0.566f, 0.0f, -1.109f, -0.323f, -1.362f, -0.872f)
                close()
                moveTo(5.501f, 5.482f)
                curveToRelative(0.224f, 0.0f, 0.449f, -0.05f, 0.663f, -0.155f)
                lineToRelative(5.0f, -2.469f)
                curveToRelative(0.743f, -0.367f, 1.048f, -1.267f, 0.681f, -2.009f)
                curveToRelative(-0.366f, -0.744f, -1.267f, -1.047f, -2.009f, -0.681f)
                lineTo(4.836f, 2.636f)
                curveToRelative(-0.743f, 0.367f, -1.048f, 1.267f, -0.681f, 2.009f)
                curveToRelative(0.261f, 0.529f, 0.793f, 0.836f, 1.346f, 0.836f)
                close()
                moveTo(17.871f, 7.634f)
                lineTo(4.871f, 13.638f)
                curveToRelative(-0.752f, 0.348f, -1.08f, 1.239f, -0.732f, 1.991f)
                curveToRelative(0.253f, 0.548f, 0.795f, 0.872f, 1.362f, 0.872f)
                curveToRelative(0.211f, 0.0f, 0.425f, -0.045f, 0.628f, -0.139f)
                lineToRelative(13.0f, -6.005f)
                curveToRelative(0.752f, -0.348f, 1.08f, -1.239f, 0.732f, -1.991f)
                reflectiveCurveToRelative(-1.241f, -1.08f, -1.99f, -0.733f)
                close()
                moveTo(17.871f, 13.177f)
                lineToRelative(-9.0f, 4.158f)
                curveToRelative(-0.531f, 0.246f, -0.871f, 0.777f, -0.871f, 1.362f)
                verticalLineToRelative(2.304f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.655f)
                lineToRelative(3.129f, -1.445f)
                curveToRelative(0.752f, -0.348f, 1.08f, -1.239f, 0.732f, -1.991f)
                curveToRelative(-0.348f, -0.752f, -1.242f, -1.079f, -1.99f, -0.733f)
                close()
            }
        }
        .build()
        return _lightbulbCfl!!
    }

private var _lightbulbCfl: ImageVector? = null
