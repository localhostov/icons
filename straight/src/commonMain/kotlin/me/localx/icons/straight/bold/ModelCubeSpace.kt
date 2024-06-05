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

public val Icons.Bold.ModelCubeSpace: ImageVector
    get() {
        if (_modelCubeSpace != null) {
            return _modelCubeSpace!!
        }
        _modelCubeSpace = Builder(name = "ModelCubeSpace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.849f)
                lineToRelative(-4.004f, -2.288f)
                lineToRelative(4.004f, -2.288f)
                lineToRelative(4.004f, 2.288f)
                lineToRelative(-4.004f, 2.288f)
                close()
                moveTo(7.0f, 10.295f)
                verticalLineToRelative(4.576f)
                lineToRelative(4.0f, 2.286f)
                verticalLineToRelative(-4.576f)
                lineToRelative(-4.0f, -2.286f)
                close()
                moveTo(17.0f, 10.295f)
                lineToRelative(-4.0f, 2.286f)
                verticalLineToRelative(4.576f)
                lineToRelative(4.0f, -2.286f)
                verticalLineToRelative(-4.576f)
                close()
                moveTo(22.5f, 5.988f)
                verticalLineToRelative(12.025f)
                lineToRelative(-10.5f, 6.001f)
                lineTo(1.5f, 18.013f)
                lineTo(1.5f, 5.987f)
                lineTo(12.0f, -0.014f)
                lineToRelative(10.5f, 6.001f)
                close()
                moveTo(19.5f, 16.273f)
                verticalLineToRelative(-7.406f)
                lineToRelative(-2.5f, 1.428f)
                verticalLineToRelative(-1.165f)
                lineToRelative(-0.996f, -0.569f)
                lineToRelative(2.477f, -1.415f)
                lineToRelative(-6.481f, -3.704f)
                lineToRelative(-6.481f, 3.704f)
                lineToRelative(2.477f, 1.415f)
                lineToRelative(-0.996f, 0.569f)
                verticalLineToRelative(1.165f)
                lineToRelative(-2.5f, -1.428f)
                verticalLineToRelative(7.406f)
                lineToRelative(6.5f, 3.715f)
                verticalLineToRelative(-2.831f)
                lineToRelative(1.0f, 0.571f)
                lineToRelative(1.0f, -0.571f)
                verticalLineToRelative(2.831f)
                lineToRelative(6.5f, -3.715f)
                close()
            }
        }
        .build()
        return _modelCubeSpace!!
    }

private var _modelCubeSpace: ImageVector? = null
