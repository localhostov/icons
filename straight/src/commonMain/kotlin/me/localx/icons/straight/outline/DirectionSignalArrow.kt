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

public val Icons.Outline.DirectionSignalArrow: ImageVector
    get() {
        if (_directionSignalArrow != null) {
            return _directionSignalArrow!!
        }
        _directionSignalArrow = Builder(name = "DirectionSignalArrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.414f, 13.414f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.75f, -2.75f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                lineToRelative(2.75f, 2.75f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.048f, 0.0f, -2.828f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.75f, 2.75f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.125f, 0.0f, 2.164f, 0.373f, 3.0f, 1.003f)
                verticalLineTo(3.0f)
                lineToRelative(-2.75f, 2.75f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.75f, -2.75f)
                verticalLineToRelative(9.003f)
                curveToRelative(0.836f, -0.629f, 1.875f, -1.003f, 3.0f, -1.003f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.048f, 0.0f, 2.828f)
                close()
            }
        }
        .build()
        return _directionSignalArrow!!
    }

private var _directionSignalArrow: ImageVector? = null
