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

public val Icons.Filled.BowlScoops: ImageVector
    get() {
        if (_bowlScoops != null) {
            return _bowlScoops!!
        }
        _bowlScoops = Builder(name = "BowlScoops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 13.0f)
                lineToRelative(1.413f, 3.584f)
                curveToRelative(1.376f, 2.208f, 3.698f, 2.416f, 5.908f, 2.416f)
                curveToRelative(0.298f, 0.0f, 2.655f, 0.005f, 3.68f, 0.002f)
                verticalLineToRelative(2.998f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.998f)
                curveToRelative(1.024f, 0.003f, 2.457f, 0.009f, 2.797f, 0.013f)
                curveToRelative(2.464f, 0.029f, 5.234f, 0.064f, 6.791f, -2.432f)
                lineToRelative(1.412f, -3.584f)
                lineTo(0.0f, 12.999f)
                close()
                moveTo(0.025f, 11.0f)
                curveToRelative(0.257f, -3.351f, 3.059f, -6.0f, 6.475f, -6.0f)
                curveToRelative(2.317f, 0.0f, 4.349f, 1.222f, 5.5f, 3.052f)
                curveToRelative(1.151f, -1.83f, 3.183f, -3.052f, 5.5f, -3.052f)
                curveToRelative(3.415f, 0.0f, 6.218f, 2.649f, 6.475f, 6.0f)
                lineTo(0.025f, 11.0f)
                close()
                moveTo(6.525f, 3.0f)
                curveToRelative(1.157f, -1.803f, 3.179f, -3.0f, 5.475f, -3.0f)
                reflectiveCurveToRelative(4.319f, 1.197f, 5.475f, 3.0f)
                curveToRelative(-2.044f, 0.006f, -3.968f, 0.735f, -5.475f, 2.024f)
                curveToRelative(-1.508f, -1.289f, -3.432f, -2.018f, -5.475f, -2.024f)
                close()
            }
        }
        .build()
        return _bowlScoops!!
    }

private var _bowlScoops: ImageVector? = null
