package me.localx.icons.straight.bold

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
                moveTo(5.501f, 16.501f)
                curveToRelative(-0.566f, 0.0f, -1.109f, -0.323f, -1.362f, -0.872f)
                curveToRelative(-0.348f, -0.752f, -0.02f, -1.643f, 0.732f, -1.991f)
                lineToRelative(13.0f, -6.005f)
                curveToRelative(0.748f, -0.346f, 1.643f, -0.02f, 1.99f, 0.733f)
                curveToRelative(0.348f, 0.752f, 0.02f, 1.643f, -0.732f, 1.991f)
                lineToRelative(-13.0f, 6.005f)
                curveToRelative(-0.203f, 0.094f, -0.417f, 0.139f, -0.628f, 0.139f)
                close()
                moveTo(6.129f, 10.834f)
                lineToRelative(13.0f, -6.005f)
                curveToRelative(0.752f, -0.348f, 1.08f, -1.239f, 0.732f, -1.991f)
                curveToRelative(-0.348f, -0.753f, -1.242f, -1.081f, -1.99f, -0.733f)
                lineTo(4.871f, 8.111f)
                curveToRelative(-0.752f, 0.348f, -1.08f, 1.239f, -0.732f, 1.991f)
                curveToRelative(0.253f, 0.548f, 0.796f, 0.872f, 1.362f, 0.872f)
                curveToRelative(0.211f, 0.0f, 0.425f, -0.045f, 0.628f, -0.139f)
                close()
                moveTo(6.164f, 5.326f)
                lineToRelative(5.0f, -2.468f)
                curveToRelative(0.743f, -0.367f, 1.048f, -1.266f, 0.681f, -2.009f)
                curveToRelative(-0.366f, -0.743f, -1.264f, -1.047f, -2.009f, -0.681f)
                lineTo(4.836f, 2.635f)
                curveToRelative(-0.743f, 0.367f, -1.048f, 1.266f, -0.681f, 2.009f)
                curveToRelative(0.261f, 0.529f, 0.793f, 0.836f, 1.346f, 0.836f)
                curveToRelative(0.223f, 0.0f, 0.449f, -0.05f, 0.663f, -0.155f)
                close()
                moveTo(19.868f, 13.885f)
                curveToRelative(-0.34f, -0.756f, -1.228f, -1.093f, -1.983f, -0.753f)
                lineToRelative(-4.884f, 2.147f)
                lineToRelative(-0.004f, 3.721f)
                horizontalLineToRelative(-2.001f)
                lineToRelative(0.002f, -2.836f)
                lineToRelative(-3.0f, 1.333f)
                verticalLineToRelative(6.503f)
                horizontalLineToRelative(7.994f)
                lineToRelative(0.006f, -6.779f)
                lineToRelative(3.116f, -1.352f)
                curveToRelative(0.756f, -0.34f, 1.093f, -1.228f, 0.753f, -1.983f)
                close()
            }
        }
        .build()
        return _lightbulbCfl!!
    }

private var _lightbulbCfl: ImageVector? = null
