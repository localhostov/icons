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

public val Icons.Filled.ParagraphLeft: ImageVector
    get() {
        if (_paragraphLeft != null) {
            return _paragraphLeft!!
        }
        _paragraphLeft = Builder(name = "ParagraphLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                curveTo(5.691f, 0.0f, 3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineToRelative(2.551f, 2.552f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.551f, -3.552f)
                curveToRelative(-0.78f, -0.779f, -0.78f, -2.049f, 0.0f, -2.828f)
                lineToRelative(3.551f, -3.552f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.551f, 2.552f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _paragraphLeft!!
    }

private var _paragraphLeft: ImageVector? = null
