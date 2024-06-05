package me.localx.icons.straight.filled

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

public val Icons.Filled.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) {
            return _treeDeciduous!!
        }
        _treeDeciduous = Builder(name = "TreeDeciduous", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.927f, 5.062f)
                curveToRelative(-0.452f, -2.864f, -2.938f, -5.062f, -5.927f, -5.062f)
                reflectiveCurveTo(6.525f, 2.197f, 6.073f, 5.062f)
                curveToRelative(-3.423f, 0.454f, -6.073f, 3.393f, -6.073f, 6.938f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.586f)
                lineToRelative(-3.707f, -3.707f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.707f, 3.707f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -3.546f, -2.65f, -6.484f, -6.073f, -6.938f)
                close()
            }
        }
        .build()
        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
