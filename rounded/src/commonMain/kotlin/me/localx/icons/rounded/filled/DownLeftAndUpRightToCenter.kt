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

public val Icons.Filled.DownLeftAndUpRightToCenter: ImageVector
    get() {
        if (_downLeftAndUpRightToCenter != null) {
            return _downLeftAndUpRightToCenter!!
        }
        _downLeftAndUpRightToCenter = Builder(name = "DownLeftAndUpRightToCenter", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 1.707f)
                lineToRelative(-5.405f, 5.405f)
                lineToRelative(2.463f, 2.463f)
                curveToRelative(0.506f, 0.506f, 0.139f, 1.378f, -0.58f, 1.383f)
                lineToRelative(-6.382f, 0.042f)
                curveToRelative(-0.446f, 0.003f, -0.806f, -0.356f, -0.803f, -0.803f)
                lineToRelative(0.042f, -6.382f)
                curveToRelative(0.005f, -0.72f, 0.877f, -1.086f, 1.383f, -0.58f)
                lineToRelative(2.463f, 2.463f)
                lineTo(22.293f, 0.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(10.197f, 13.0f)
                lineToRelative(-6.382f, 0.042f)
                curveToRelative(-0.72f, 0.005f, -1.086f, 0.877f, -0.58f, 1.383f)
                lineToRelative(2.463f, 2.463f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(5.405f, -5.405f)
                lineToRelative(2.463f, 2.463f)
                curveToRelative(0.506f, 0.506f, 1.378f, 0.14f, 1.383f, -0.58f)
                lineToRelative(0.042f, -6.382f)
                curveToRelative(0.003f, -0.446f, -0.356f, -0.806f, -0.803f, -0.803f)
                close()
            }
        }
        .build()
        return _downLeftAndUpRightToCenter!!
    }

private var _downLeftAndUpRightToCenter: ImageVector? = null
