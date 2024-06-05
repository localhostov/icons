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

public val Icons.Filled.DiamondExclamation: ImageVector
    get() {
        if (_diamondExclamation != null) {
            return _diamondExclamation!!
        }
        _diamondExclamation = Builder(name = "DiamondExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.161f, 9.873f)
                lineTo(14.122f, 0.834f)
                curveToRelative(-1.134f, -1.133f, -3.11f, -1.133f, -4.243f, 0.0f)
                lineTo(0.839f, 9.873f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(9.039f, 9.039f)
                curveToRelative(0.567f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(9.04f, -9.039f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.073f, 0.0f, -4.243f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _diamondExclamation!!
    }

private var _diamondExclamation: ImageVector? = null
