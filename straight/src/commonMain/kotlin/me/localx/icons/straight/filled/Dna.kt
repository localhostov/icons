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

public val Icons.Filled.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.54f, 13.229f)
                curveToRelative(-0.589f, 0.408f, -1.18f, 0.803f, -1.763f, 1.191f)
                curveToRelative(0.72f, 0.511f, 1.41f, 1.034f, 2.054f, 1.58f)
                horizontalLineToRelative(-7.662f)
                curveToRelative(1.319f, -1.118f, 2.835f, -2.134f, 4.385f, -3.168f)
                curveToRelative(4.644f, -3.096f, 9.445f, -6.297f, 9.445f, -12.832f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.711f, -0.073f, 1.374f, -0.205f, 2.0f)
                lineTo(4.21f, 2.0f)
                curveToRelative(-0.132f, -0.627f, -0.21f, -1.288f, -0.21f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 5.12f, 2.95f, 8.191f, 6.46f, 10.771f)
                curveToRelative(0.589f, -0.408f, 1.18f, -0.803f, 1.763f, -1.191f)
                curveToRelative(-0.72f, -0.511f, -1.41f, -1.034f, -2.054f, -1.58f)
                horizontalLineToRelative(7.662f)
                curveToRelative(-1.319f, 1.118f, -2.835f, 2.134f, -4.385f, 3.168f)
                curveToRelative(-4.644f, 3.096f, -9.445f, 6.297f, -9.445f, 12.832f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.711f, 0.073f, -1.374f, 0.205f, -2.0f)
                horizontalLineToRelative(15.584f)
                curveToRelative(0.132f, 0.627f, 0.21f, 1.288f, 0.21f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -5.12f, -2.95f, -8.191f, -6.46f, -10.771f)
                close()
                moveTo(4.89f, 4.0f)
                horizontalLineToRelative(14.216f)
                curveToRelative(-0.345f, 0.717f, -0.775f, 1.38f, -1.28f, 2.0f)
                lineTo(6.173f, 6.0f)
                curveToRelative(-0.505f, -0.62f, -0.938f, -1.283f, -1.283f, -2.0f)
                close()
                moveTo(4.894f, 20.0f)
                curveToRelative(0.345f, -0.717f, 0.775f, -1.38f, 1.28f, -2.0f)
                horizontalLineToRelative(11.653f)
                curveToRelative(0.505f, 0.62f, 0.938f, 1.283f, 1.283f, 2.0f)
                lineTo(4.894f, 20.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
