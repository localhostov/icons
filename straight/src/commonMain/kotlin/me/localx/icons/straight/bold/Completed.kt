package me.localx.icons.straight.bold

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

public val Icons.Bold.Completed: ImageVector
    get() {
        if (_completed != null) {
            return _completed!!
        }
        _completed = Builder(name = "Completed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.41f, 12.0f)
                lineToRelative(3.063f, -3.0f)
                horizontalLineToRelative(1.527f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.59f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(5.338f)
                curveToRelative(0.562f, -1.182f, 1.769f, -2.0f, 3.162f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.394f, 0.0f, 2.6f, 0.818f, 3.162f, 2.0f)
                horizontalLineToRelative(5.338f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(19.0f, 5.0f)
                close()
                moveTo(8.673f, 12.006f)
                curveToRelative(0.585f, 0.0f, 1.169f, -0.226f, 1.618f, -0.676f)
                lineToRelative(2.692f, -2.692f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.203f, 2.203f)
                lineToRelative(-0.928f, -0.878f)
                lineToRelative(-2.062f, 2.178f)
                lineToRelative(1.43f, 1.354f)
                curveToRelative(0.445f, 0.422f, 1.011f, 0.632f, 1.574f, 0.632f)
                close()
                moveTo(15.473f, 15.0f)
                lineToRelative(-3.063f, 3.0f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.527f)
                close()
                moveTo(10.862f, 12.517f)
                lineToRelative(-2.203f, 2.203f)
                lineToRelative(-0.928f, -0.878f)
                lineToRelative(-2.062f, 2.178f)
                lineToRelative(1.43f, 1.354f)
                curveToRelative(0.445f, 0.422f, 1.011f, 0.632f, 1.574f, 0.632f)
                curveToRelative(0.585f, 0.0f, 1.169f, -0.226f, 1.618f, -0.676f)
                lineToRelative(2.692f, -2.692f)
                lineToRelative(-2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _completed!!
    }

private var _completed: ImageVector? = null
