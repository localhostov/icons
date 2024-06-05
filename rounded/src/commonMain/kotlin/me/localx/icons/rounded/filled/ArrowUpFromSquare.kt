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

public val Icons.Filled.ArrowUpFromSquare: ImageVector
    get() {
        if (_arrowUpFromSquare != null) {
            return _arrowUpFromSquare!!
        }
        _arrowUpFromSquare = Builder(name = "ArrowUpFromSquare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.279f, 6.693f)
                curveToRelative(-0.383f, -0.398f, -0.371f, -1.031f, 0.027f, -1.414f)
                lineTo(9.893f, 0.865f)
                curveToRelative(1.105f, -1.106f, 3.095f, -1.12f, 4.229f, 0.014f)
                lineToRelative(4.572f, 4.4f)
                curveToRelative(0.398f, 0.383f, 0.41f, 1.016f, 0.027f, 1.414f)
                curveToRelative(-0.196f, 0.204f, -0.458f, 0.307f, -0.721f, 0.307f)
                curveToRelative(-0.25f, 0.0f, -0.5f, -0.093f, -0.693f, -0.279f)
                lineTo(13.0f, 2.575f)
                verticalLineToRelative(13.425f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(11.0f, 2.575f)
                lineTo(6.693f, 6.721f)
                curveToRelative(-0.397f, 0.383f, -1.029f, 0.371f, -1.414f, -0.027f)
                close()
                moveTo(20.75f, 8.0f)
                curveToRelative(-0.472f, 0.0f, -0.742f, 0.227f, -0.75f, 0.234f)
                curveToRelative(-1.174f, 1.032f, -3.051f, 0.919f, -4.21f, -0.197f)
                lineToRelative(-0.79f, -0.76f)
                verticalLineToRelative(8.724f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.345f, -3.0f, -3.0f)
                lineTo(9.0f, 7.276f)
                lineToRelative(-0.79f, 0.76f)
                curveToRelative(-1.16f, 1.116f, -3.036f, 1.229f, -4.21f, 0.197f)
                curveToRelative(-0.008f, -0.007f, -0.278f, -0.234f, -0.75f, -0.234f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(9.75f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                lineTo(22.0f, 9.25f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
            }
        }
        .build()
        return _arrowUpFromSquare!!
    }

private var _arrowUpFromSquare: ImageVector? = null
