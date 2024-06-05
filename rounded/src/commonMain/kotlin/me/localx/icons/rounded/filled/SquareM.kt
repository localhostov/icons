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

public val Icons.Filled.SquareM: ImageVector
    get() {
        if (_squareM != null) {
            return _squareM!!
        }
        _squareM = Builder(name = "SquareM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 6.812f)
                verticalLineToRelative(11.188f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(17.0f, 7.583f)
                lineToRelative(-4.142f, 6.931f)
                curveToRelative(-0.361f, 0.604f, -1.355f, 0.604f, -1.717f, 0.0f)
                lineToRelative(-4.142f, -6.926f)
                verticalLineToRelative(10.412f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(4.999f, 6.812f)
                curveToRelative(0.0f, -0.817f, 0.479f, -1.496f, 1.221f, -1.73f)
                curveToRelative(0.751f, -0.238f, 1.569f, 0.048f, 2.032f, 0.709f)
                lineToRelative(3.747f, 6.261f)
                lineToRelative(3.708f, -6.201f)
                curveToRelative(0.501f, -0.721f, 1.318f, -1.006f, 2.071f, -0.77f)
                curveToRelative(0.742f, 0.234f, 1.221f, 0.913f, 1.221f, 1.73f)
                close()
            }
        }
        .build()
        return _squareM!!
    }

private var _squareM: ImageVector? = null
