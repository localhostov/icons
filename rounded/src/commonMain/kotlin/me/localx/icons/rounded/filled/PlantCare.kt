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

public val Icons.Filled.PlantCare: ImageVector
    get() {
        if (_plantCare != null) {
            return _plantCare!!
        }
        _plantCare = Builder(name = "PlantCare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.12f, 2.04f)
                curveToRelative(-0.241f, -0.479f, -0.045f, -1.063f, 0.442f, -1.287f)
                curveTo(1.882f, 0.146f, 4.864f, -0.653f, 7.689f, 0.905f)
                curveToRelative(1.534f, 0.846f, 2.181f, 2.64f, 1.624f, 4.222f)
                curveToRelative(0.149f, 0.396f, 0.279f, 0.82f, 0.38f, 1.286f)
                curveToRelative(0.41f, -0.378f, 0.874f, -0.705f, 1.354f, -0.995f)
                curveToRelative(-0.071f, -1.214f, 0.698f, -2.413f, 1.91f, -2.941f)
                curveToRelative(2.029f, -0.885f, 4.363f, -0.339f, 5.482f, 0.111f)
                curveToRelative(0.502f, 0.202f, 0.721f, 0.789f, 0.478f, 1.272f)
                curveToRelative(-0.773f, 1.541f, -2.225f, 2.952f, -3.709f, 3.781f)
                curveToRelative(-1.102f, 0.616f, -2.431f, 0.402f, -3.302f, -0.422f)
                curveToRelative(-0.981f, 0.64f, -1.73f, 1.532f, -1.98f, 2.154f)
                curveToRelative(-0.154f, 0.383f, -0.525f, 0.626f, -0.927f, 0.626f)
                curveToRelative(-0.732f, 0.0f, -0.98f, -0.488f, -1.0f, -0.959f)
                curveToRelative(-0.04f, -0.981f, -0.165f, -1.836f, -0.358f, -2.56f)
                curveToRelative(-0.259f, -1.288f, -1.43f, -2.376f, -1.496f, -2.494f)
                curveToRelative(-1.629f, -1.728f, -3.63f, -1.986f, -3.63f, -1.986f)
                curveToRelative(2.179f, 2.49f, 3.0f, 3.5f, 3.471f, 5.484f)
                curveToRelative(-0.605f, 0.008f, -1.218f, -0.121f, -1.784f, -0.433f)
                curveTo(2.295f, 5.999f, 0.991f, 3.771f, 0.12f, 2.04f)
                close()
                moveTo(23.152f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.252f, 0.596f)
                curveToRelative(-0.547f, 0.078f, -1.053f, -0.302f, -1.131f, -0.848f)
                curveToRelative(-0.078f, -0.547f, 0.302f, -1.053f, 0.848f, -1.131f)
                lineToRelative(4.162f, -0.583f)
                curveToRelative(0.936f, -0.134f, 1.748f, -0.806f, 1.94f, -1.732f)
                curveToRelative(0.296f, -1.425f, -0.79f, -2.685f, -2.164f, -2.685f)
                lineTo(4.003f, 11.0f)
                curveTo(1.794f, 11.0f, 0.003f, 12.791f, 0.003f, 15.0f)
                verticalLineToRelative(5.0f)
                curveTo(0.003f, 22.209f, 1.794f, 24.0f, 4.003f, 24.0f)
                horizontalLineToRelative(4.262f)
                curveToRelative(2.805f, 0.0f, 5.48f, -1.178f, 7.374f, -3.246f)
                lineToRelative(7.702f, -8.409f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _plantCare!!
    }

private var _plantCare: ImageVector? = null
