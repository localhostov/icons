package me.localx.icons.straight.outline

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

public val Icons.Outline.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 7.324f)
                lineToRelative(1.43f, -1.4f)
                lineToRelative(-5.75f, -5.873f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.256f, 2.3f)
                lineToRelative(-2.179f, 2.041f)
                lineToRelative(-0.912f, -0.913f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.243f, 0.0f)
                lineToRelative(-8.707f, 8.707f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.957f, 2.957f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.957f, -2.957f)
                horizontalLineToRelative(6.0f)
                lineToRelative(8.707f, -8.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.243f)
                lineToRelative(-0.844f, -0.843f)
                lineToRelative(2.163f, -2.023f)
                close()
                moveTo(17.707f, 10.879f)
                lineTo(9.586f, 19.0f)
                horizontalLineToRelative(-4.586f)
                verticalLineToRelative(-3.711f)
                lineToRelative(1.918f, 1.918f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.355f, -2.355f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(2.355f, 2.355f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.355f, -2.355f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(2.355f, 2.355f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.355f, -2.355f)
                lineToRelative(1.144f, -1.145f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 0.0f)
                lineToRelative(3.171f, 3.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.415f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
