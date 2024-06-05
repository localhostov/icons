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

public val Icons.Outline.IndustryWindows: ImageVector
    get() {
        if (_industryWindows != null) {
            return _industryWindows!!
        }
        _industryWindows = Builder(name = "IndustryWindows", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(5.807f, 0.0f)
                lineToRelative(2.305f, 10.631f)
                lineToRelative(5.889f, -4.712f)
                verticalLineToRelative(4.167f)
                lineToRelative(5.0f, -4.247f)
                verticalLineToRelative(4.263f)
                lineToRelative(5.0f, -4.271f)
                verticalLineToRelative(15.169f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(2.0f, 2.0f)
                lineTo(2.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(21.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(22.0f, 10.169f)
                lineToRelative(-3.313f, 2.831f)
                horizontalLineToRelative(-1.687f)
                verticalLineToRelative(-2.839f)
                lineToRelative(-3.342f, 2.839f)
                horizontalLineToRelative(-1.658f)
                verticalLineToRelative(-2.919f)
                lineToRelative(-3.649f, 2.919f)
                horizontalLineToRelative(-1.772f)
                lineTo(4.193f, 2.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _industryWindows!!
    }

private var _industryWindows: ImageVector? = null
