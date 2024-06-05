package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShieldInterrogation: ImageVector
    get() {
        if (_shieldInterrogation != null) {
            return _shieldInterrogation!!
        }
        _shieldInterrogation = Builder(name = "ShieldInterrogation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.581f, 2.14f)
                lineTo(12.316f, 0.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.632f, 0.0f)
                lineTo(5.418f, 2.14f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 2.0f, 6.883f)
                lineTo(2.0f, 12.0f)
                curveToRelative(0.0f, 7.563f, 9.2f, 11.74f, 9.594f, 11.914f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.812f, 0.0f)
                curveTo(12.8f, 23.74f, 22.0f, 19.563f, 22.0f, 12.0f)
                lineTo(22.0f, 6.883f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 18.581f, 2.14f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 19.0f)
                close()
                moveTo(13.928f, 12.557f)
                arcTo(1.987f, 1.987f, 0.0f, false, false, 13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, true, 1.963f, -3.195f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 1.0f, -2.124f)
                arcToRelative(2.024f, 2.024f, 0.0f, false, false, -1.6f, -1.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 9.052f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.429f, 5.987f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.5f, 6.57f)
                close()
            }
        }
        .build()
        return _shieldInterrogation!!
    }

private var _shieldInterrogation: ImageVector? = null
