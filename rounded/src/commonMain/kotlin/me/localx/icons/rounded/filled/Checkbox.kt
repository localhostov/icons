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

public val Icons.Filled.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 0.0f)
                horizontalLineTo(106.667f)
                curveTo(47.786f, 0.071f, 0.071f, 47.786f, 0.0f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(0.071f, 464.214f, 47.786f, 511.93f, 106.667f, 512.0f)
                horizontalLineToRelative(298.667f)
                curveTo(464.214f, 511.93f, 511.93f, 464.214f, 512.0f, 405.333f)
                verticalLineTo(106.667f)
                curveTo(511.93f, 47.786f, 464.214f, 0.071f, 405.333f, 0.0f)
                close()
                moveTo(426.667f, 172.352f)
                lineTo(229.248f, 369.771f)
                curveToRelative(-16.659f, 16.666f, -43.674f, 16.671f, -60.34f, 0.012f)
                curveToRelative(-0.004f, -0.004f, -0.008f, -0.008f, -0.012f, -0.012f)
                lineToRelative(-83.563f, -83.541f)
                curveToRelative(-8.348f, -8.348f, -8.348f, -21.882f, 0.0f, -30.229f)
                reflectiveCurveToRelative(21.882f, -8.348f, 30.229f, 0.0f)
                lineToRelative(83.541f, 83.541f)
                lineToRelative(197.44f, -197.419f)
                curveToRelative(8.348f, -8.318f, 21.858f, -8.294f, 30.176f, 0.053f)
                curveTo(435.038f, 150.524f, 435.014f, 164.034f, 426.667f, 172.352f)
                close()
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
