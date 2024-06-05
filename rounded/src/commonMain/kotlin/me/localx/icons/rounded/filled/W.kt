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

public val Icons.Filled.W: ImageVector
    get() {
        if (_w != null) {
            return _w!!
        }
        _w = Builder(name = "W", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.843f, 24.013f)
                curveToRelative(-0.097f, 0.0f, -0.195f, -0.004f, -0.294f, -0.012f)
                curveToRelative(-1.654f, -0.129f, -2.949f, -1.316f, -3.221f, -2.953f)
                lineTo(0.014f, 1.164f)
                curveTo(-0.077f, 0.62f, 0.291f, 0.104f, 0.835f, 0.014f)
                curveToRelative(0.551f, -0.098f, 1.06f, 0.277f, 1.151f, 0.822f)
                lineToRelative(3.314f, 19.884f)
                curveToRelative(0.146f, 0.88f, 0.822f, 1.242f, 1.405f, 1.288f)
                curveToRelative(0.578f, 0.038f, 1.307f, -0.207f, 1.589f, -1.054f)
                lineToRelative(2.757f, -8.271f)
                curveToRelative(0.136f, -0.408f, 0.518f, -0.684f, 0.949f, -0.684f)
                reflectiveCurveToRelative(0.812f, 0.275f, 0.949f, 0.684f)
                lineToRelative(2.756f, 8.271f)
                curveToRelative(0.282f, 0.846f, 0.997f, 1.093f, 1.589f, 1.054f)
                curveToRelative(0.583f, -0.046f, 1.259f, -0.408f, 1.405f, -1.288f)
                lineTo(22.014f, 0.836f)
                curveToRelative(0.091f, -0.545f, 0.604f, -0.916f, 1.15f, -0.822f)
                curveToRelative(0.545f, 0.091f, 0.913f, 0.606f, 0.822f, 1.15f)
                lineToRelative(-3.314f, 19.884f)
                curveToRelative(-0.272f, 1.637f, -1.567f, 2.824f, -3.221f, 2.953f)
                curveToRelative(-1.644f, 0.129f, -3.118f, -0.841f, -3.643f, -2.414f)
                lineToRelative(-1.809f, -5.425f)
                lineToRelative(-1.808f, 5.425f)
                curveToRelative(-0.493f, 1.479f, -1.817f, 2.426f, -3.349f, 2.426f)
                close()
            }
        }
        .build()
        return _w!!
    }

private var _w: ImageVector? = null
