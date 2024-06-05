package me.localx.icons.straight.bold

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

public val Icons.Bold.Second: ImageVector
    get() {
        if (_second != null) {
            return _second!!
        }
        _second = Builder(name = "Second", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.013f)
                lineToRelative(-0.005f, -2.0f)
                horizontalLineToRelative(2.018f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.026f)
                lineToRelative(-0.005f, -2.004f)
                lineToRelative(-3.0f, 0.008f)
                lineToRelative(0.005f, 1.996f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(-0.005f, -2.004f)
                lineToRelative(-3.0f, 0.008f)
                lineToRelative(0.005f, 1.996f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.013f)
                lineToRelative(0.005f, 2.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.026f)
                lineToRelative(0.005f, 2.004f)
                lineToRelative(3.0f, -0.008f)
                lineToRelative(-0.005f, -1.996f)
                horizontalLineToRelative(1.969f)
                lineToRelative(0.005f, 2.004f)
                lineToRelative(3.0f, -0.008f)
                lineToRelative(-0.005f, -1.996f)
                horizontalLineToRelative(2.005f)
                close()
                moveTo(5.018f, 14.0f)
                lineToRelative(-0.005f, -2.0f)
                horizontalLineToRelative(1.969f)
                lineToRelative(0.005f, 2.0f)
                horizontalLineToRelative(-1.969f)
                close()
                moveTo(15.637f, 19.0f)
                horizontalLineToRelative(8.363f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.715f, 2.322f, -4.608f, 4.568f, -6.439f)
                curveToRelative(2.179f, -1.776f, 4.432f, -3.612f, 4.432f, -5.983f)
                curveToRelative(0.0f, -1.754f, -1.256f, -3.077f, -2.923f, -3.077f)
                curveToRelative(-1.316f, 0.0f, -2.433f, 0.835f, -2.872f, 2.0f)
                horizontalLineToRelative(-3.104f)
                curveToRelative(0.511f, -2.838f, 2.993f, -5.0f, 5.976f, -5.0f)
                curveToRelative(3.321f, 0.0f, 5.923f, 2.669f, 5.923f, 6.077f)
                curveToRelative(0.0f, 3.796f, -2.941f, 6.193f, -5.536f, 8.309f)
                curveToRelative(-1.107f, 0.902f, -2.176f, 1.774f, -2.827f, 2.614f)
                close()
            }
        }
        .build()
        return _second!!
    }

private var _second: ImageVector? = null
