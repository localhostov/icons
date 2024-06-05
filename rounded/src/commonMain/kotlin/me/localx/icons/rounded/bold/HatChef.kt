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

public val Icons.Bold.HatChef: ImageVector
    get() {
        if (_hatChef != null) {
            return _hatChef!!
        }
        _hatChef = Builder(name = "HatChef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.848f, 5.066f)
                arcToRelative(5.691f, 5.691f, 0.0f, false, false, -4.032f, -3.915f)
                arcToRelative(5.836f, 5.836f, 0.0f, false, false, -3.748f, 0.362f)
                arcTo(5.957f, 5.957f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(5.956f, 5.956f, 0.0f, false, false, 7.931f, 1.514f)
                arcTo(5.828f, 5.828f, 0.0f, false, false, 4.287f, 1.13f)
                arcTo(5.21f, 5.21f, 0.0f, false, false, 0.578f, 3.892f)
                arcToRelative(5.576f, 5.576f, 0.0f, false, false, 0.3f, 5.444f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 4.0f, 11.778f)
                verticalLineTo(19.5f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 8.5f, 24.0f)
                lineToRelative(7.0f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 20.0f, 19.5f)
                verticalLineTo(11.747f)
                arcToRelative(5.808f, 5.808f, 0.0f, false, false, 2.781f, -1.976f)
                arcTo(5.576f, 5.576f, 0.0f, false, false, 23.848f, 5.066f)
                close()
                moveTo(20.406f, 7.938f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 18.467f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 10.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 9.0f)
                arcTo(2.519f, 2.519f, 0.0f, false, true, 3.422f, 7.753f)
                arcToRelative(2.591f, 2.591f, 0.0f, false, true, -0.155f, -2.532f)
                arcToRelative(2.213f, 2.213f, 0.0f, false, true, 1.612f, -1.15f)
                arcTo(2.451f, 2.451f, 0.0f, false, true, 7.11f, 4.55f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.314f, -0.21f)
                arcTo(2.941f, 2.941f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(2.941f, 2.941f, 0.0f, false, true, 2.576f, 1.34f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.314f, 0.21f)
                arcToRelative(2.516f, 2.516f, 0.0f, false, true, 2.286f, -0.467f)
                horizontalLineToRelative(0.0f)
                arcTo(2.791f, 2.791f, 0.0f, false, true, 20.93f, 5.762f)
                arcTo(2.592f, 2.592f, 0.0f, false, true, 20.406f, 7.938f)
                close()
            }
        }
        .build()
        return _hatChef!!
    }

private var _hatChef: ImageVector? = null
