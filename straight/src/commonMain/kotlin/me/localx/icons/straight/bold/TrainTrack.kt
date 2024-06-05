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

public val Icons.Bold.TrainTrack: ImageVector
    get() {
        if (_trainTrack != null) {
            return _trainTrack!!
        }
        _trainTrack = Builder(name = "TrainTrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                lineToRelative(-0.294f, -3.0f)
                horizontalLineToRelative(-2.336f)
                lineToRelative(-0.196f, -2.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.294f, -3.0f)
                horizontalLineToRelative(-2.336f)
                lineToRelative(-0.196f, -2.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.294f, -3.0f)
                horizontalLineToRelative(-2.336f)
                lineToRelative(-0.196f, -2.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.294f, -3.0f)
                horizontalLineToRelative(-2.336f)
                lineToRelative(-0.294f, -3.0f)
                horizontalLineToRelative(-3.014f)
                lineToRelative(0.294f, 3.0f)
                lineTo(7.115f, 3.0f)
                lineToRelative(0.294f, -3.0f)
                horizontalLineToRelative(-3.014f)
                lineToRelative(-0.294f, 3.0f)
                lineTo(1.765f, 3.0f)
                lineToRelative(-0.294f, 3.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.196f, 2.0f)
                lineTo(1.274f, 8.0f)
                lineToRelative(-0.294f, 3.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.196f, 2.0f)
                lineTo(0.784f, 13.0f)
                lineToRelative(-0.294f, 3.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.196f, 2.0f)
                lineTo(0.294f, 18.0f)
                lineToRelative(-0.294f, 3.0f)
                horizontalLineToRelative(2.336f)
                lineToRelative(-0.294f, 3.0f)
                horizontalLineToRelative(3.014f)
                lineToRelative(0.294f, -3.0f)
                horizontalLineToRelative(13.3f)
                lineToRelative(0.294f, 3.0f)
                horizontalLineToRelative(3.014f)
                lineToRelative(-0.294f, -3.0f)
                horizontalLineToRelative(2.336f)
                close()
                moveTo(6.821f, 6.0f)
                horizontalLineToRelative(10.359f)
                lineToRelative(0.196f, 2.0f)
                lineTo(6.625f, 8.0f)
                lineToRelative(0.196f, -2.0f)
                close()
                moveTo(6.331f, 11.0f)
                horizontalLineToRelative(11.339f)
                lineToRelative(0.196f, 2.0f)
                lineTo(6.134f, 13.0f)
                lineToRelative(0.196f, -2.0f)
                close()
                moveTo(5.645f, 18.0f)
                lineToRelative(0.196f, -2.0f)
                horizontalLineToRelative(12.319f)
                lineToRelative(0.196f, 2.0f)
                lineTo(5.644f, 18.0f)
                close()
            }
        }
        .build()
        return _trainTrack!!
    }

private var _trainTrack: ImageVector? = null
