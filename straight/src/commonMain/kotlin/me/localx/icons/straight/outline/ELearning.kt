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

public val Icons.Outline.ELearning: ImageVector
    get() {
        if (_eLearning != null) {
            return _eLearning!!
        }
        _eLearning = Builder(name = "ELearning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.824f, -2.884f)
                lineToRelative(-3.0f, 0.858f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, false, -1.176f, 0.652f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, false, -1.176f, -0.652f)
                lineToRelative(-3.0f, -0.858f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.824f, 2.884f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
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
                moveTo(13.0f, 3.858f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.725f, -0.961f)
                lineToRelative(3.0f, -0.857f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, 0.275f, -0.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.246f)
                lineToRelative(-5.0f, 1.428f)
                close()
                moveTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.275f, -0.96f)
                lineToRelative(3.0f, 0.857f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.725f, 0.961f)
                verticalLineToRelative(6.816f)
                lineToRelative(-5.0f, -1.428f)
                close()
                moveTo(2.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.754f)
                lineToRelative(8.0f, 2.286f)
                lineToRelative(8.0f, -2.286f)
                verticalLineToRelative(-5.754f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-20.0f)
                close()
            }
        }
        .build()
        return _eLearning!!
    }

private var _eLearning: ImageVector? = null
