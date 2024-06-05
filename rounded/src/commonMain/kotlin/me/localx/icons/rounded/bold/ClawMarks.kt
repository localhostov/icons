package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ClawMarks: ImageVector
    get() {
        if (_clawMarks != null) {
            return _clawMarks!!
        }
        _clawMarks = Builder(name = "ClawMarks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.526f, 23.759f)
                curveTo(14.705f, 16.424f, 7.292f, 9.01f, 0.259f, 1.564f)
                curveTo(-0.454f, 0.81f, 0.434f, -0.362f, 1.36f, 0.108f)
                curveToRelative(5.897f, 2.994f, 16.14f, 10.392f, 22.551f, 22.637f)
                curveToRelative(0.445f, 0.849f, -0.687f, 1.67f, -1.386f, 1.014f)
                close()
                moveTo(22.571f, 12.777f)
                curveToRelative(0.686f, 0.616f, 1.72f, -0.151f, 1.352f, -1.009f)
                curveTo(20.983f, 4.904f, 15.622f, 1.57f, 12.198f, 0.07f)
                curveToRelative(-0.856f, -0.375f, -1.593f, 0.708f, -0.96f, 1.41f)
                curveToRelative(3.586f, 3.976f, 7.368f, 7.738f, 11.333f, 11.297f)
                close()
                moveTo(0.994f, 9.137f)
                curveToRelative(-0.701f, -0.301f, -1.319f, 0.589f, -0.803f, 1.153f)
                curveToRelative(4.259f, 4.645f, 8.722f, 9.132f, 13.368f, 13.479f)
                curveToRelative(0.677f, 0.633f, 1.744f, -0.145f, 1.359f, -0.99f)
                curveTo(11.161f, 14.527f, 4.659f, 10.71f, 0.994f, 9.137f)
                close()
            }
        }
        .build()
        return _clawMarks!!
    }

private var _clawMarks: ImageVector? = null
