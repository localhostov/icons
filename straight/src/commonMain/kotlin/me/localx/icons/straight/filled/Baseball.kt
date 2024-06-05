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

public val Icons.Filled.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                arcToRelative(11.939f, 11.939f, 0.0f, false, true, -3.1f, 8.024f)
                arcToRelative(10.229f, 10.229f, 0.0f, false, true, -3.26f, -4.487f)
                lineToRelative(1.941f, -0.579f)
                lineToRelative(-0.572f, -1.916f)
                lineToRelative(-1.869f, 0.558f)
                arcToRelative(10.217f, 10.217f, 0.0f, false, true, -0.14f, -1.6f)
                arcToRelative(10.217f, 10.217f, 0.0f, false, true, 0.14f, -1.6f)
                lineToRelative(1.866f, 0.556f)
                lineToRelative(0.572f, -1.916f)
                lineToRelative(-1.941f, -0.579f)
                arcToRelative(10.229f, 10.229f, 0.0f, false, true, 3.263f, -4.485f)
                arcToRelative(11.939f, 11.939f, 0.0f, false, true, 3.1f, 8.024f)
                close()
                moveTo(6.363f, 15.537f)
                lineTo(4.422f, 14.958f)
                lineTo(4.994f, 13.042f)
                lineTo(6.86f, 13.6f)
                arcToRelative(10.217f, 10.217f, 0.0f, false, false, 0.14f, -1.6f)
                arcToRelative(10.217f, 10.217f, 0.0f, false, false, -0.14f, -1.6f)
                lineToRelative(-1.866f, 0.556f)
                lineToRelative(-0.572f, -1.914f)
                lineToRelative(1.941f, -0.579f)
                arcToRelative(10.229f, 10.229f, 0.0f, false, false, -3.263f, -4.487f)
                arcToRelative(11.926f, 11.926f, 0.0f, false, false, 0.0f, 16.048f)
                arcToRelative(10.229f, 10.229f, 0.0f, false, false, 3.263f, -4.487f)
                close()
                moveTo(15.724f, 16.108f)
                lineTo(13.824f, 16.673f)
                lineTo(13.252f, 14.756f)
                lineTo(15.212f, 14.171f)
                arcToRelative(12.225f, 12.225f, 0.0f, false, true, -0.212f, -2.171f)
                arcToRelative(12.225f, 12.225f, 0.0f, false, true, 0.216f, -2.171f)
                lineToRelative(-1.96f, -0.585f)
                lineToRelative(0.572f, -1.917f)
                lineToRelative(1.9f, 0.565f)
                arcToRelative(12.232f, 12.232f, 0.0f, false, true, 3.7f, -5.3f)
                arcToRelative(11.933f, 11.933f, 0.0f, false, false, -14.844f, 0.0f)
                arcToRelative(12.232f, 12.232f, 0.0f, false, true, 3.7f, 5.3f)
                lineToRelative(1.9f, -0.565f)
                lineToRelative(0.572f, 1.917f)
                lineToRelative(-1.96f, 0.585f)
                arcToRelative(12.225f, 12.225f, 0.0f, false, true, 0.204f, 2.171f)
                arcToRelative(12.225f, 12.225f, 0.0f, false, true, -0.216f, 2.171f)
                lineToRelative(1.96f, 0.585f)
                lineToRelative(-0.572f, 1.917f)
                lineToRelative(-1.9f, -0.565f)
                arcToRelative(12.232f, 12.232f, 0.0f, false, true, -3.7f, 5.3f)
                arcToRelative(11.933f, 11.933f, 0.0f, false, false, 14.844f, 0.0f)
                arcToRelative(12.232f, 12.232f, 0.0f, false, true, -3.692f, -5.3f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
