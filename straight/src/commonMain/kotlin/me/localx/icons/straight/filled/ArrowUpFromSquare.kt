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
                moveTo(6.733f, 7.68f)
                lineToRelative(-1.467f, -1.36f)
                lineTo(10.56f, 0.613f)
                curveToRelative(0.807f, -0.807f, 2.075f, -0.807f, 2.854f, -0.027f)
                lineToRelative(5.319f, 5.734f)
                lineToRelative(-1.467f, 1.36f)
                lineTo(13.0f, 3.08f)
                verticalLineToRelative(12.92f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 3.034f)
                lineTo(6.733f, 7.68f)
                close()
                moveTo(21.841f, 6.082f)
                horizontalLineToRelative(-0.042f)
                lineToRelative(-4.639f, 4.424f)
                lineToRelative(-2.16f, -2.329f)
                verticalLineToRelative(9.823f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 8.169f)
                lineToRelative(-2.153f, 2.344f)
                lineTo(2.171f, 6.06f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-0.099f, 0.297f, -0.166f, 0.61f, -0.166f, 0.94f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -0.322f, -0.064f, -0.627f, -0.159f, -0.918f)
                close()
            }
        }
        .build()
        return _arrowUpFromSquare!!
    }

private var _arrowUpFromSquare: ImageVector? = null
