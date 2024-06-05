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

public val Icons.Outline.TimeAdd: ImageVector
    get() {
        if (_timeAdd != null) {
            return _timeAdd!!
        }
        _timeAdd = Builder(name = "TimeAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(-2.707f, 2.707f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.293f, -3.293f)
                verticalLineToRelative(-5.414f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 19.949f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.028f, -0.331f, 0.051f, -0.662f, 0.051f, -1.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                curveToRelative(0.338f, 0.0f, 0.669f, -0.023f, 1.0f, -0.051f)
                verticalLineToRelative(-2.0f)
                arcToRelative(9.992f, 9.992f, 0.0f, false, true, -11.0f, -9.949f)
                close()
            }
        }
        .build()
        return _timeAdd!!
    }

private var _timeAdd: ImageVector? = null
