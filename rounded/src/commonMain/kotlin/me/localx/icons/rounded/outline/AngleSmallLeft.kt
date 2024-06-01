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

public val Icons.Outline.AngleSmallLeft: ImageVector
    get() {
        if (_angleSmallLeft != null) {
            return _angleSmallLeft!!
        }
        _angleSmallLeft = Builder(name = "AngleSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5999f, 12.7101f)
                curveTo(10.5062f, 12.6171f, 10.4318f, 12.5065f, 10.381f, 12.3846f)
                curveTo(10.3302f, 12.2628f, 10.3041f, 12.1321f, 10.3041f, 12.0001f)
                curveTo(10.3041f, 11.868f, 10.3302f, 11.7373f, 10.381f, 11.6155f)
                curveTo(10.4318f, 11.4936f, 10.5062f, 11.383f, 10.5999f, 11.2901f)
                lineTo(15.1899f, 6.7101f)
                curveTo(15.2836f, 6.6171f, 15.358f, 6.5065f, 15.4088f, 6.3846f)
                curveTo(15.4596f, 6.2628f, 15.4857f, 6.1321f, 15.4857f, 6.0001f)
                curveTo(15.4857f, 5.8681f, 15.4596f, 5.7373f, 15.4088f, 5.6155f)
                curveTo(15.358f, 5.4936f, 15.2836f, 5.383f, 15.1899f, 5.2901f)
                curveTo(15.0025f, 5.1038f, 14.7491f, 4.9993f, 14.4849f, 4.9993f)
                curveTo(14.2207f, 4.9993f, 13.9673f, 5.1038f, 13.7799f, 5.2901f)
                lineTo(9.1899f, 9.8801f)
                curveTo(8.6281f, 10.4426f, 8.3125f, 11.2051f, 8.3125f, 12.0001f)
                curveTo(8.3125f, 12.7951f, 8.6281f, 13.5576f, 9.1899f, 14.1201f)
                lineTo(13.7799f, 18.7101f)
                curveTo(13.9662f, 18.8948f, 14.2176f, 18.999f, 14.4799f, 19.0001f)
                curveTo(14.6115f, 19.0008f, 14.742f, 18.9756f, 14.8638f, 18.9258f)
                curveTo(14.9856f, 18.8761f, 15.0965f, 18.8027f, 15.1899f, 18.7101f)
                curveTo(15.2836f, 18.6171f, 15.358f, 18.5065f, 15.4088f, 18.3846f)
                curveTo(15.4596f, 18.2628f, 15.4857f, 18.1321f, 15.4857f, 18.0001f)
                curveTo(15.4857f, 17.868f, 15.4596f, 17.7373f, 15.4088f, 17.6155f)
                curveTo(15.358f, 17.4936f, 15.2836f, 17.383f, 15.1899f, 17.2901f)
                lineTo(10.5999f, 12.7101f)
                close()
            }
        }
        .build()
        return _angleSmallLeft!!
    }

private var _angleSmallLeft: ImageVector? = null
