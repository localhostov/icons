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

public val Icons.Bold.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.671f, 24.0f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, true, -2.471f, -1.025f)
                lineToRelative(-3.39f, -3.419f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.131f, -2.112f)
                lineToRelative(3.385f, 3.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.0f)
                lineToRelative(5.414f, -5.415f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                lineToRelative(-5.415f, 5.414f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, true, -2.476f, 1.021f)
                close()
                moveTo(2.085f, 18.9f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, false, 1.008f, -1.9f)
                arcToRelative(2.763f, 2.763f, 0.0f, false, true, 1.444f, -3.157f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, false, 1.012f, -3.355f)
                arcToRelative(5.121f, 5.121f, 0.0f, false, true, -0.456f, -3.3f)
                arcToRelative(5.052f, 5.052f, 0.0f, false, true, 4.215f, -4.088f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, 3.908f, 0.989f)
                arcToRelative(5.109f, 5.109f, 0.0f, false, true, 2.0f, 3.419f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.29f, 1.288f)
                arcToRelative(5.168f, 5.168f, 0.0f, false, true, 4.472f, 5.545f)
                verticalLineToRelative(0.053f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, false, 1.385f, 1.567f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, false, 1.613f, -1.418f)
                arcToRelative(8.162f, 8.162f, 0.0f, false, false, -6.0f, -8.506f)
                arcToRelative(8.094f, 8.094f, 0.0f, false, false, -2.95f, -4.341f)
                arcToRelative(8.188f, 8.188f, 0.0f, false, false, -6.145f, -1.571f)
                arcToRelative(8.054f, 8.054f, 0.0f, false, false, -6.735f, 6.505f)
                arcToRelative(8.108f, 8.108f, 0.0f, false, false, 0.541f, 4.824f)
                arcToRelative(5.759f, 5.759f, 0.0f, false, false, -2.5f, 6.293f)
                lineToRelative(0.047f, 0.174f)
                arcToRelative(1.447f, 1.447f, 0.0f, false, false, 1.407f, 1.044f)
                arcToRelative(1.582f, 1.582f, 0.0f, false, false, 0.444f, -0.065f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
