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

public val Icons.Bold.BallotCheck: ImageVector
    get() {
        if (_ballotCheck != null) {
            return _ballotCheck!!
        }
        _ballotCheck = Builder(name = "BallotCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.947f, 10.674f)
                lineToRelative(-2.759f, 2.702f)
                curveToRelative(-0.415f, 0.416f, -0.965f, 0.624f, -1.517f, 0.624f)
                curveToRelative(-0.555f, 0.0f, -1.112f, -0.211f, -1.536f, -0.635f)
                lineToRelative(-1.443f, -1.386f)
                lineToRelative(2.079f, -2.163f)
                lineToRelative(0.891f, 0.856f)
                lineToRelative(2.187f, -2.142f)
                lineToRelative(2.099f, 2.144f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(19.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.5f)
                close()
                moveTo(12.409f, 14.0f)
                horizontalLineToRelative(4.591f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.527f)
                lineToRelative(-3.063f, 3.0f)
                close()
            }
        }
        .build()
        return _ballotCheck!!
    }

private var _ballotCheck: ImageVector? = null
