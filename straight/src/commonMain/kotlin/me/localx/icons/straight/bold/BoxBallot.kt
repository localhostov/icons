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

public val Icons.Bold.BoxBallot: ImageVector
    get() {
        if (_boxBallot != null) {
            return _boxBallot!!
        }
        _boxBallot = Builder(name = "BoxBallot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 8.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(19.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 11.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 3.5f)
                close()
                moveTo(3.5f, 11.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                close()
            }
        }
        .build()
        return _boxBallot!!
    }

private var _boxBallot: ImageVector? = null
