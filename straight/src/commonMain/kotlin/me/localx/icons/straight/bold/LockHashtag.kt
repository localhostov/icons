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

public val Icons.Bold.LockHashtag: ImageVector
    get() {
        if (_lockHashtag != null) {
            return _lockHashtag!!
        }
        _lockHashtag = Builder(name = "LockHashtag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 14.0f)
                horizontalLineToRelative(2.604f)
                lineToRelative(-0.353f, 3.0f)
                horizontalLineToRelative(-2.251f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.931f, 21.0f)
                lineToRelative(-0.353f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                curveTo(3.0f, 3.14f, 6.14f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(6.931f)
                close()
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.802f, 17.0f)
                lineToRelative(-0.36f, 3.0f)
                horizontalLineToRelative(2.121f)
                lineToRelative(-0.235f, 2.0f)
                horizontalLineToRelative(-2.126f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(-2.012f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(-3.155f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(-2.012f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(-2.195f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(2.2f)
                lineToRelative(0.36f, -3.0f)
                horizontalLineToRelative(-2.358f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(2.363f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(3.155f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(1.958f)
                lineToRelative(-0.235f, 2.0f)
                horizontalLineToRelative(-1.963f)
                close()
                moveTo(19.79f, 17.0f)
                horizontalLineToRelative(-3.155f)
                lineToRelative(-0.36f, 3.0f)
                horizontalLineToRelative(3.155f)
                lineToRelative(0.36f, -3.0f)
                close()
            }
        }
        .build()
        return _lockHashtag!!
    }

private var _lockHashtag: ImageVector? = null
