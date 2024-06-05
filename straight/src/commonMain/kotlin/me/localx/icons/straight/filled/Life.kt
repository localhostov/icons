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

public val Icons.Filled.Life: ImageVector
    get() {
        if (_life != null) {
            return _life!!
        }
        _life = Builder(name = "Life", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16.0f, 18.438f)
                verticalLineToRelative(5.562f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-5.562f)
                lineTo(1.821f, 12.735f)
                lineToRelative(1.357f, -1.47f)
                lineToRelative(6.212f, 5.735f)
                horizontalLineToRelative(5.219f)
                lineToRelative(6.212f, -5.735f)
                lineToRelative(1.357f, 1.47f)
                lineToRelative(-6.179f, 5.703f)
                close()
                moveTo(12.0f, 9.167f)
                reflectiveCurveToRelative(5.0f, -3.49f, 5.0f, -6.394f)
                curveToRelative(0.0f, -1.531f, -1.119f, -2.773f, -2.5f, -2.773f)
                reflectiveCurveToRelative(-2.5f, 1.241f, -2.5f, 2.773f)
                curveToRelative(0.0f, -1.531f, -1.119f, -2.773f, -2.5f, -2.773f)
                reflectiveCurveToRelative(-2.5f, 1.241f, -2.5f, 2.773f)
                curveToRelative(0.0f, 2.904f, 5.0f, 6.394f, 5.0f, 6.394f)
                close()
            }
        }
        .build()
        return _life!!
    }

private var _life: ImageVector? = null
