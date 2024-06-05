package me.localx.icons.straight.outline

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

public val Icons.Outline.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.949f, 2.644f)
                lineTo(12.0f, 0.009f)
                lineTo(4.051f, 2.644f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 2.0f, 5.476f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 7.524f, 9.2f, 11.679f, 9.594f, 11.852f)
                lineToRelative(0.354f, 0.157f)
                lineToRelative(0.368f, -0.122f)
                curveTo(12.711f, 23.755f, 22.0f, 20.577f, 22.0f, 12.0f)
                verticalLineTo(5.476f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 19.949f, 2.644f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 6.263f, -6.349f, 9.216f, -7.953f, 9.861f)
                curveTo(10.44f, 21.058f, 4.0f, 17.494f, 4.0f, 12.0f)
                verticalLineTo(5.476f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.684f, -0.944f)
                lineTo(12.0f, 2.106f)
                lineToRelative(7.316f, 2.426f)
                arcTo(0.992f, 0.992f, 0.0f, false, true, 20.0f, 5.476f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
