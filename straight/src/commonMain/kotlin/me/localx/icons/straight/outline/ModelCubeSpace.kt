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

public val Icons.Outline.ModelCubeSpace: ImageVector
    get() {
        if (_modelCubeSpace != null) {
            return _modelCubeSpace!!
        }
        _modelCubeSpace = Builder(name = "ModelCubeSpace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, -0.009f)
                lineTo(1.5f, 5.991f)
                verticalLineToRelative(12.018f)
                lineToRelative(10.5f, 6.0f)
                lineToRelative(10.5f, -6.0f)
                lineTo(22.5f, 5.991f)
                lineTo(12.0f, -0.009f)
                close()
                moveTo(19.485f, 6.571f)
                lineToRelative(-2.483f, 1.419f)
                lineToRelative(-5.002f, -2.871f)
                lineToRelative(-5.002f, 2.871f)
                lineToRelative(-2.483f, -1.419f)
                lineToRelative(7.485f, -4.277f)
                lineToRelative(7.485f, 4.277f)
                close()
                moveTo(8.0f, 10.865f)
                lineToRelative(3.0f, 1.714f)
                verticalLineToRelative(3.425f)
                lineToRelative(-3.0f, -1.715f)
                verticalLineToRelative(-3.424f)
                close()
                moveTo(13.0f, 12.579f)
                lineToRelative(3.0f, -1.714f)
                verticalLineToRelative(3.424f)
                lineToRelative(-3.0f, 1.715f)
                verticalLineToRelative(-3.425f)
                close()
                moveTo(12.0f, 10.848f)
                lineToRelative(-2.988f, -1.708f)
                lineToRelative(2.988f, -1.715f)
                lineToRelative(2.988f, 1.715f)
                lineToRelative(-2.988f, 1.708f)
                close()
                moveTo(3.5f, 8.294f)
                lineToRelative(2.5f, 1.428f)
                verticalLineToRelative(5.727f)
                lineToRelative(5.0f, 2.857f)
                verticalLineToRelative(2.827f)
                lineToRelative(-7.5f, -4.286f)
                verticalLineToRelative(-8.554f)
                close()
                moveTo(13.0f, 21.134f)
                verticalLineToRelative(-2.827f)
                lineToRelative(5.0f, -2.857f)
                verticalLineToRelative(-5.727f)
                lineToRelative(2.5f, -1.428f)
                verticalLineToRelative(8.554f)
                lineToRelative(-7.5f, 4.286f)
                close()
            }
        }
        .build()
        return _modelCubeSpace!!
    }

private var _modelCubeSpace: ImageVector? = null
