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

public val Icons.Filled.ELearning: ImageVector
    get() {
        if (_eLearning != null) {
            return _eLearning!!
        }
        _eLearning = Builder(name = "ELearning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 13.04f)
                lineToRelative(-8.0f, -2.286f)
                verticalLineToRelative(-7.754f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.824f, -2.884f)
                lineToRelative(0.925f, 0.184f)
                arcToRelative(3.032f, 3.032f, 0.0f, false, true, 2.251f, 2.9f)
                verticalLineToRelative(7.47f)
                lineToRelative(1.0f, 0.286f)
                lineToRelative(1.0f, -0.286f)
                verticalLineToRelative(-7.47f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, 2.176f, -2.881f)
                lineToRelative(1.075f, -0.219f)
                arcToRelative(2.933f, 2.933f, 0.0f, false, true, 2.556f, 0.508f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, true, 1.193f, 2.392f)
                verticalLineToRelative(7.753f)
                close()
                moveTo(24.0f, 20.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                verticalLineToRelative(9.079f)
                lineToRelative(-10.0f, 2.857f)
                lineToRelative(-10.0f, -2.857f)
                verticalLineToRelative(-9.079f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, 2.816f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _eLearning!!
    }

private var _eLearning: ImageVector? = null
