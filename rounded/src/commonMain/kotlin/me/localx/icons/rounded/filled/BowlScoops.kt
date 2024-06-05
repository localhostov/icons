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
                moveToRelative(23.674f, 13.811f)
                curveToRelative(-0.347f, -0.508f, -0.921f, -0.811f, -1.536f, -0.811f)
                horizontalLineTo(1.862f)
                curveToRelative(-0.615f, 0.0f, -1.189f, 0.303f, -1.537f, 0.811f)
                reflectiveCurveToRelative(-0.421f, 1.153f, -0.198f, 1.726f)
                curveToRelative(0.0f, 0.0f, 0.169f, 0.423f, 0.198f, 0.472f)
                curveToRelative(1.623f, 2.706f, 3.926f, 2.964f, 5.973f, 2.992f)
                horizontalLineToRelative(4.701f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.715f)
                curveToRelative(2.032f, -0.028f, 4.337f, -0.286f, 5.959f, -2.992f)
                curveToRelative(0.029f, -0.049f, 0.198f, -0.472f, 0.198f, -0.472f)
                curveToRelative(0.224f, -0.572f, 0.149f, -1.218f, -0.198f, -1.726f)
                close()
                moveTo(1.158f, 11.0f)
                curveToRelative(-0.783f, 0.0f, -1.341f, -0.75f, -1.102f, -1.48f)
                curveToRelative(0.857f, -2.619f, 3.365f, -4.52f, 6.322f, -4.52f)
                curveToRelative(2.368f, 0.0f, 4.445f, 1.222f, 5.622f, 3.052f)
                curveToRelative(1.177f, -1.83f, 3.254f, -3.052f, 5.622f, -3.052f)
                curveToRelative(2.957f, 0.0f, 5.465f, 1.902f, 6.322f, 4.52f)
                curveToRelative(0.239f, 0.73f, -0.319f, 1.48f, -1.102f, 1.48f)
                horizontalLineTo(1.158f)
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
