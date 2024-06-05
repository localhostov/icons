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

public val Icons.Bold.Stage: ImageVector
    get() {
        if (_stage != null) {
            return _stage!!
        }
        _stage = Builder(name = "Stage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.621f, 21.0f)
                lineToRelative(-5.121f, -5.121f)
                lineTo(13.5f, 7.621f)
                lineToRelative(1.733f, -1.733f)
                curveToRelative(0.246f, 0.065f, 0.5f, 0.112f, 0.767f, 0.112f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.267f, 0.046f, 0.521f, 0.112f, 0.767f)
                lineToRelative(-6.172f, 6.172f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.439f, -1.439f)
                verticalLineToRelative(5.258f)
                lineToRelative(-5.121f, 5.121f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.379f)
                close()
                moveTo(12.0f, 18.621f)
                lineToRelative(2.379f, 2.379f)
                horizontalLineToRelative(-4.758f)
                lineToRelative(2.379f, -2.379f)
                close()
            }
        }
        .build()
        return _stage!!
    }

private var _stage: ImageVector? = null
