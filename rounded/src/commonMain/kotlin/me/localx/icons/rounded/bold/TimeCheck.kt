package me.localx.icons.rounded.bold

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

public val Icons.Bold.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.856f, 20.743f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 11.144f, -8.743f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -14.856f, 11.657f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, 0.356f, 0.043f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.355f, -2.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.621f, 15.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 0.0f)
                lineToRelative(-4.785f, 4.782f)
                lineToRelative(-2.133f, -2.26f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, -0.043f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.042f, 2.121f)
                lineToRelative(2.581f, 2.721f)
                arcToRelative(2.362f, 2.362f, 0.0f, false, false, 1.674f, 0.74f)
                horizontalLineToRelative(0.037f)
                arcToRelative(2.368f, 2.368f, 0.0f, false, false, 1.661f, -0.688f)
                lineToRelative(5.254f, -5.252f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.005f, -2.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 7.5f)
                verticalLineToRelative(3.555f)
                lineToRelative(-2.4f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.475f, 2.068f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.068f, 0.475f)
                lineToRelative(2.869f, -1.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.938f, -1.7f)
                verticalLineToRelative(-4.098f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
