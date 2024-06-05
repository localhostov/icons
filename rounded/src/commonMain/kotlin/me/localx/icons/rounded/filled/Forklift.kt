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

public val Icons.Filled.Forklift: ImageVector
    get() {
        if (_forklift != null) {
            return _forklift!!
        }
        _forklift = Builder(name = "Forklift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 24.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 16.5f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-8.4f)
                curveToRelative(-1.394f, 0.0f, -2.619f, -0.928f, -2.996f, -2.27f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.121f, -0.432f, -0.515f, -0.73f, -0.963f, -0.73f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.497f, -2.5f)
                horizontalLineToRelative(2.497f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                close()
                moveTo(9.53f, 11.188f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.135f, 0.48f, 0.572f, 0.812f, 1.07f, 0.812f)
                horizontalLineToRelative(5.107f)
                lineToRelative(-1.455f, -7.905f)
                curveToRelative(-0.437f, -2.373f, -2.505f, -4.095f, -4.917f, -4.095f)
                horizontalLineToRelative(-4.336f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.644f)
                curveToRelative(1.344f, 0.0f, 2.524f, 0.894f, 2.886f, 2.188f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null
