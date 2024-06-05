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

public val Icons.Filled.CustomizeEdit: ImageVector
    get() {
        if (_customizeEdit != null) {
            return _customizeEdit!!
        }
        _customizeEdit = Builder(name = "CustomizeEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.013f, 13.649f)
                curveToRelative(0.158f, 1.78f, -1.24f, 3.274f, -2.988f, 3.274f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.681f, 0.0f, -1.163f, -0.656f, -0.961f, -1.307f)
                curveToRelative(0.499f, -1.608f, 1.936f, -4.181f, 4.249f, -4.626f)
                curveToRelative(1.755f, -0.338f, 3.542f, 0.879f, 3.7f, 2.659f)
                close()
                moveTo(23.295f, 0.707f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.025f, 0.025f, -5.276f, 5.814f, -7.692f, 8.479f)
                curveToRelative(0.653f, 0.171f, 1.276f, 0.464f, 1.826f, 0.879f)
                curveToRelative(0.692f, 0.522f, 1.205f, 1.215f, 1.544f, 1.982f)
                lineToRelative(7.728f, -7.924f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                close()
                moveTo(15.99f, 14.471f)
                curveToRelative(-0.117f, 1.047f, -0.557f, 2.042f, -1.276f, 2.827f)
                curveToRelative(-0.945f, 1.033f, -2.29f, 1.625f, -3.688f, 1.625f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.953f, 0.0f, -1.858f, -0.457f, -2.422f, -1.223f)
                curveToRelative(-0.564f, -0.767f, -0.732f, -1.768f, -0.449f, -2.678f)
                curveToRelative(0.708f, -2.283f, 2.536f, -5.101f, 5.371f, -5.874f)
                lineToRelative(2.866f, -3.16f)
                curveToRelative(1.091f, -1.202f, 1.978f, -2.181f, 2.711f, -2.988f)
                lineTo(5.0f, 3.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-9.666f)
                lineToRelative(-5.01f, 5.137f)
                close()
            }
        }
        .build()
        return _customizeEdit!!
    }

private var _customizeEdit: ImageVector? = null
