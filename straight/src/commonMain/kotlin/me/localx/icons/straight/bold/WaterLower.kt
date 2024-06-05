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

public val Icons.Bold.WaterLower: ImageVector
    get() {
        if (_waterLower != null) {
            return _waterLower!!
        }
        _waterLower = Builder(name = "WaterLower", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, true, -3.0f, -1.17f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(4.468f, 4.468f, 0.0f, false, true, 0.0f, 18.0f)
                lineTo(0.0f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.408f, -1.0f)
                lineTo(4.592f, 14.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, 2.816f, 0.0f)
                horizontalLineToRelative(3.184f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, 2.816f, 0.0f)
                horizontalLineToRelative(3.184f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, 2.816f, 0.0f)
                horizontalLineToRelative(3.184f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 15.0f)
                close()
                moveTo(22.592f, 20.0f)
                lineTo(19.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(13.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(7.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(1.408f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(24.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.592f, 20.0f)
                close()
                moveTo(10.5f, 0.0f)
                lineTo(10.5f, 8.0f)
                lineTo(7.538f, 8.0f)
                lineToRelative(3.673f, 3.673f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, false, 1.578f, 0.0f)
                lineTo(16.462f, 8.0f)
                lineTo(13.5f, 8.0f)
                lineTo(13.5f, 0.0f)
                close()
            }
        }
        .build()
        return _waterLower!!
    }

private var _waterLower: ImageVector? = null
