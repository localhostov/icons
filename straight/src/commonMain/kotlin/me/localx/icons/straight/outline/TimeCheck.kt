package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.4f, 24.0f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(1.876f, 1.876f, 0.0f, false, true, -1.345f, -0.6f)
                lineToRelative(-3.168f, -3.262f)
                lineToRelative(1.446f, -1.382f)
                lineToRelative(3.105f, 3.2f)
                lineToRelative(6.081f, -6.082f)
                lineToRelative(1.414f, 1.411f)
                lineToRelative(-6.161f, 6.162f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, true, -1.339f, 0.553f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 6.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(-2.707f, 2.707f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.293f, -3.293f)
                verticalLineToRelative(-5.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, 23.949f)
                verticalLineToRelative(-2.0f)
                arcToRelative(10.007f, 10.007f, 0.0f, true, true, 10.949f, -8.949f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.028f, -0.331f, 0.051f, -0.662f, 0.051f, -1.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
