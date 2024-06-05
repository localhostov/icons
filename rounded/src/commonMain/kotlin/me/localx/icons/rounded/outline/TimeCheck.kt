package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

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
                moveToRelative(23.707f, 16.325f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-5.627f, 5.628f)
                lineToRelative(-2.688f, -2.653f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.435f, 1.4f)
                lineToRelative(2.744f, 2.7f)
                arcToRelative(1.876f, 1.876f, 0.0f, false, false, 1.345f, 0.6f)
                horizontalLineToRelative(0.033f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 1.335f, -0.553f)
                lineToRelative(5.707f, -5.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.09f, 21.959f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.91f, -9.959f)
                curveToRelative(0.0f, 0.307f, -0.015f, 0.611f, -0.041f, 0.911f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.907f, 1.089f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 1.085f, -0.907f)
                curveToRelative(0.032f, -0.363f, 0.049f, -0.726f, 0.049f, -1.093f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -13.09f, 11.951f)
                horizontalLineToRelative(0.091f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.089f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 7.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(-2.707f, 2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, -0.707f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
