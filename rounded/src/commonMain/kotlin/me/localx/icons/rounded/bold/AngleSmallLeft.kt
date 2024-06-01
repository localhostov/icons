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

public val Icons.Bold.AngleSmallLeft: ImageVector
    get() {
        if (_angleSmallLeft != null) {
            return _angleSmallLeft!!
        }
        _angleSmallLeft = Builder(name = "AngleSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.957f, 12.354f)
                curveTo(10.9105f, 12.3076f, 10.8735f, 12.2524f, 10.8483f, 12.1916f)
                curveTo(10.8231f, 12.1309f, 10.8101f, 12.0658f, 10.8101f, 12.0f)
                curveTo(10.8101f, 11.9342f, 10.8231f, 11.8691f, 10.8483f, 11.8084f)
                curveTo(10.8735f, 11.7476f, 10.9105f, 11.6925f, 10.957f, 11.646f)
                lineTo(15.543f, 7.061f)
                curveTo(15.8244f, 6.7797f, 15.9825f, 6.3982f, 15.9826f, 6.0004f)
                curveTo(15.9827f, 5.6025f, 15.8248f, 5.2209f, 15.5435f, 4.9395f)
                curveTo(15.2622f, 4.6581f, 14.8807f, 4.5f, 14.4829f, 4.4999f)
                curveTo(14.085f, 4.4998f, 13.7034f, 4.6577f, 13.422f, 4.939f)
                lineTo(8.836f, 9.525f)
                curveTo(8.1808f, 10.182f, 7.8128f, 11.0721f, 7.8128f, 12.0f)
                curveTo(7.8128f, 12.9279f, 8.1808f, 13.818f, 8.836f, 14.475f)
                lineTo(13.422f, 19.061f)
                curveTo(13.7034f, 19.3423f, 14.085f, 19.5002f, 14.4829f, 19.5001f)
                curveTo(14.8807f, 19.5f, 15.2622f, 19.3419f, 15.5435f, 19.0605f)
                curveTo(15.8248f, 18.7791f, 15.9827f, 18.3975f, 15.9826f, 17.9997f)
                curveTo(15.9825f, 17.6018f, 15.8244f, 17.2203f, 15.543f, 16.939f)
                lineTo(10.957f, 12.354f)
                close()
            }
        }
        .build()
        return _angleSmallLeft!!
    }

private var _angleSmallLeft: ImageVector? = null
