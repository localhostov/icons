package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CarTilt: ImageVector
    get() {
        if (_carTilt != null) {
            return _carTilt!!
        }
        _carTilt = Builder(name = "CarTilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                lineTo(8.509f, 21.0f)
                arcToRelative(2.012f, 2.012f, 0.0f, false, false, 1.717f, -2.977f)
                lineTo(10.215f, 18.0f)
                lineToRelative(8.043f, -4.645f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.44f, -2.039f)
                lineToRelative(-0.172f, -0.307f)
                arcTo(3.817f, 3.817f, 0.0f, false, false, 21.589f, 6.9f)
                lineToRelative(-0.706f, -1.138f)
                arcToRelative(9.562f, 9.562f, 0.0f, false, false, -2.706f, -3.047f)
                lineToRelative(-2.3f, -1.671f)
                arcTo(5.518f, 5.518f, 0.0f, false, false, 9.956f, 0.7f)
                lineTo(3.826f, 4.143f)
                arcToRelative(5.513f, 5.513f, 0.0f, false, false, -2.8f, 5.217f)
                lineToRelative(0.222f, 3.113f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, 1.215f, 3.958f)
                lineToRelative(0.811f, 1.313f)
                arcTo(3.79f, 3.79f, 0.0f, false, false, 6.5f, 19.555f)
                lineToRelative(0.234f, 0.418f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 21.0f)
                close()
                moveTo(5.293f, 6.76f)
                lineToRelative(6.13f, -3.444f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, true, 2.69f, 0.159f)
                lineToRelative(0.965f, 0.7f)
                lineTo(4.116f, 10.511f)
                lineToRelative(-0.1f, -1.373f)
                arcTo(2.507f, 2.507f, 0.0f, false, true, 5.293f, 6.76f)
                close()
                moveTo(5.826f, 16.166f)
                lineTo(5.048f, 14.91f)
                arcToRelative(6.531f, 6.531f, 0.0f, false, true, -0.512f, -1.176f)
                lineTo(6.328f, 12.7f)
                lineToRelative(0.5f, 0.806f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.553f, -1.577f)
                lineTo(8.927f, 11.2f)
                lineToRelative(4.3f, -2.485f)
                lineToRelative(0.522f, 0.844f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.3f, 7.978f)
                lineToRelative(-0.476f, -0.769f)
                lineToRelative(1.731f, -1.0f)
                arcTo(6.965f, 6.965f, 0.0f, false, true, 18.3f, 7.286f)
                lineToRelative(0.739f, 1.2f)
                arcToRelative(0.807f, 0.807f, 0.0f, false, true, -0.283f, 1.125f)
                lineTo(6.918f, 16.441f)
                arcTo(0.806f, 0.806f, 0.0f, false, true, 5.826f, 16.166f)
                close()
            }
        }
        .build()
        return _carTilt!!
    }

private var _carTilt: ImageVector? = null
