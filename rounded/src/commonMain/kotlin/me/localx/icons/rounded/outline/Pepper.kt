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

public val Icons.Outline.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.945f, 6.479f)
                arcToRelative(5.991f, 5.991f, 0.0f, false, false, -2.98f, -1.392f)
                curveTo(18.619f, 0.687f, 15.752f, 0.0f, 14.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                curveToRelative(1.171f, 0.0f, 2.687f, 0.351f, 2.955f, 3.105f)
                arcTo(6.073f, 6.073f, 0.0f, false, false, 12.0f, 11.048f)
                curveTo(11.981f, 13.338f, 10.516f, 15.0f, 8.515f, 15.0f)
                curveToRelative(-0.592f, 0.0f, -2.392f, 0.0f, -3.3f, -3.936f)
                arcTo(2.633f, 2.633f, 0.0f, false, false, 2.649f, 9.0f)
                curveToRelative(-5.314f, 0.483f, -1.614f, 9.518f, 0.945f, 11.563f)
                arcTo(12.441f, 12.441f, 0.0f, false, false, 12.225f, 24.0f)
                arcTo(12.247f, 12.247f, 0.0f, false, false, 24.0f, 11.635f)
                arcTo(6.206f, 6.206f, 0.0f, false, false, 21.945f, 6.479f)
                close()
                moveTo(17.433f, 7.039f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, true, 2.933f, 0.762f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, true, -4.733f, 0.0f)
                arcTo(3.822f, 3.822f, 0.0f, false, true, 17.433f, 7.039f)
                close()
                moveTo(22.0f, 11.635f)
                curveToRelative(-0.5f, 13.831f, -19.867f, 13.638f, -19.992f, -0.014f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, true, 1.261f, -0.109f)
                curveTo(4.312f, 16.048f, 6.7f, 17.0f, 8.515f, 17.0f)
                curveToRelative(3.1f, 0.0f, 5.457f, -2.552f, 5.485f, -5.937f)
                arcToRelative(4.156f, 4.156f, 0.0f, false, true, 0.371f, -1.657f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, 7.282f, -0.028f)
                arcTo(4.883f, 4.883f, 0.0f, false, true, 22.0f, 11.635f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
