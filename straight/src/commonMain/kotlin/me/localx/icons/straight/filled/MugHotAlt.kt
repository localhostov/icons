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

public val Icons.Filled.MugHotAlt: ImageVector
    get() {
        if (_mugHotAlt != null) {
            return _mugHotAlt!!
        }
        _mugHotAlt = Builder(name = "MugHotAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.033f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.033f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.033f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.033f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.033f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.033f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(0.007f, 24.0f)
                horizontalLineToRelative(20.0f)
                lineTo(20.007f, 22.0f)
                horizontalLineToRelative(-20.0f)
                close()
                moveTo(24.0f, 13.143f)
                arcTo(3.982f, 3.982f, 0.0f, false, true, 20.0f, 17.0f)
                lineTo(16.851f, 17.0f)
                arcToRelative(22.085f, 22.085f, 0.0f, false, true, -2.431f, 3.0f)
                lineTo(5.6f, 20.0f)
                arcTo(21.943f, 21.943f, 0.0f, false, true, 0.04f, 9.4f)
                arcTo(2.84f, 2.84f, 0.0f, false, true, 0.681f, 7.088f)
                arcTo(3.049f, 3.049f, 0.0f, false, true, 3.015f, 6.0f)
                lineTo(17.0f, 6.0f)
                arcTo(3.05f, 3.05f, 0.0f, false, true, 19.334f, 7.09f)
                arcTo(2.84f, 2.84f, 0.0f, false, true, 19.976f, 9.4f)
                curveToRelative(-0.035f, 0.2f, -0.081f, 0.4f, -0.123f, 0.6f)
                lineTo(20.0f, 10.0f)
                curveTo(22.469f, 10.0f, 24.0f, 11.205f, 24.0f, 13.143f)
                close()
                moveTo(22.0f, 13.143f)
                curveTo(22.0f, 12.385f, 21.329f, 12.0f, 20.0f, 12.0f)
                horizontalLineToRelative(-0.687f)
                arcToRelative(20.267f, 20.267f, 0.0f, false, true, -1.278f, 3.0f)
                lineTo(20.0f, 15.0f)
                arcTo(1.983f, 1.983f, 0.0f, false, false, 22.0f, 13.143f)
                close()
            }
        }
        .build()
        return _mugHotAlt!!
    }

private var _mugHotAlt: ImageVector? = null
