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

public val Icons.Filled.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-22.0f, -22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(2.87f, 2.87f)
                arcToRelative(7.871f, 7.871f, 0.0f, false, true, 4.237f, -2.078f)
                arcToRelative(7.985f, 7.985f, 0.0f, false, true, 8.82f, 5.541f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, 0.722f, 0.735f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 5.62f, 8.277f)
                arcToRelative(7.379f, 7.379f, 0.0f, false, true, -2.2f, 4.729f)
                close()
                moveTo(3.441f, 7.663f)
                arcToRelative(0.811f, 0.811f, 0.0f, false, false, -1.379f, 0.464f)
                arcToRelative(7.286f, 7.286f, 0.0f, false, false, -0.062f, 0.912f)
                arcToRelative(7.422f, 7.422f, 0.0f, false, false, 0.941f, 3.609f)
                arcToRelative(5.443f, 5.443f, 0.0f, false, false, -2.884f, 5.652f)
                arcToRelative(5.843f, 5.843f, 0.0f, false, false, 5.626f, 4.7f)
                horizontalLineToRelative(9.1f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, 1.952f, -0.158f)
                arcToRelative(0.839f, 0.839f, 0.0f, false, false, 0.462f, -1.42f)
                close()
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
